# 베이스 이미지 선택 (JDK 23, ARM64 아키텍처)
FROM openjdk:23-jdk-slim

# 필수 패키지 설치
RUN apt-get update && apt-get install -y \
    git \
    openssh-server \
    openssh-client \
    curl \
    sudo \
    && rm -rf /var/lib/apt/lists/*

# 작업 디렉토리 설정
WORKDIR /workspace

# 비주얼 스튜디오 코드와 연결할 설정
# 필요한 추가 설정을 여기에 작성하세요 (예: Node.js, Java 패키지 설치 등)

# SSH 키 복사 (후에 환경 설정에서 사용)
COPY .ssh /root/.ssh
COPY .ssh/id_rsa.pub /root/.ssh/authorized_keys

# SSH 키 퍼미션 설정
RUN chmod 700 /root/.ssh && \
    chmod 600 /root/.ssh/id_rsa && \
    chmod 644 /root/.ssh/id_rsa.pub && \
    chmod 600 /root/.ssh/authorized_keys

# SSH 서버 설정
RUN mkdir /var/run/sshd

# root 사용자 비밀번호 설정 (원하는 비밀번호로 변경)
RUN echo 'root:P@ssw0rd' | chpasswd

# GitHub의 호스트 키 확인을 피하려면 'known_hosts' 파일을 생성
RUN ssh-keyscan github.com >> /root/.ssh/known_hosts

# Git 설정 (SSH 키로 인증할 수 있도록 설정)
RUN git config --global user.name "[GITHUB USER NAME]" && \
    git config --global user.email "[GITHUB EMAIL ADDRESS]" && \
    git config --global core.sshCommand "ssh -i /root/.ssh/id_rsa -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no"

# SSH 서버 실행
CMD ["/usr/sbin/sshd", "-D"]

# 포트 노출
EXPOSE 22
