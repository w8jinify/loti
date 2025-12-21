<div align= "center">
    <!-- header -->
    <img src="https://capsule-render.vercel.app/api?type=waving&color=0:98a1e7,100:dbe6ff&height=180&text=Loti%20:%20IT%20service%20for%20Law&animation=twinkling&fontColor=ffffff&fontSize=50&fontAlignY=35"/>
</div>
    <!-- info -->
<div style="text-align: left;"> 
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🧑🏻‍⚖️🧑🏻‍💻 Loti </h2>  
    <div style="font-weight: 700; font-size: 15px; text-align: left; color: #282d33;"> <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=100&duration=3000&pause=5000&color=3387F7&center=true&vCenter=true&multiline=true&repeat=true&width=800&lines=We+make+it+easy+for+you+to+focus+on+development%F0%9F%94%A5"/>
    </div> 
</div>
    <!-- tech stacks -->
<div style="text-align: left;">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🛠️ Tech Stacks </h2> <br> 
    <div style="margin: ; text-align: left; text-align: left;">
        <!-- Python -->
        <img src="https://img.shields.io/badge/Python-3776AB?style=flat&logo=Python&logoColor=white">
        <!-- Java -->
        <img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white">
        <!-- Spring Boot -->
        <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat&logo=SpringBoot&logoColor=white">
        <!-- React -->
        <img src="https://img.shields.io/badge/React-61DAFB?style=flat&logo=React&logoColor=white">
        <!-- MySQL -->
        <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white">
        <!-- Github -->
        <img src="https://img.shields.io/badge/Github-181717?style=flat&logo=Github&logoColor=white">
    </div>
</div>
    <!-- stats -->
<div style="text-align: left;"> 
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🏅 Stats </h2>
    <div style="text-align: left;"> <img src="https://github-readme-stats.vercel.app/api?username=w8jinify&bg_color=60,c3b8ea,e6d9ec&title_color=ffffff&text_color=ffffff"/>
 </div> 
    <!-- footer -->
 <div align= "center">
    <img src="https://capsule-render.vercel.app/api?section=footer&height=150&type=waving&color=0:98a1e7,100:dbe6ff&animation=blink"/>
</div>

loti/
├── services/               # 개별 마이크로서비스 소스 코드
│   ├── backend-auth/       # 인증 서비스
│   ├── backend-core/       # 핵심 비즈니스 로직 서비스
│   └── frontend-web/       # 웹 프론트엔드
├── db/                     # 데이터베이스 관련 설정 및 스크립트
│   ├── init.sql            # 초기 스키마 및 데이터 설정
│   ├── backup.sh           # DB 백업 스크립트
│   ├── restore.sh          # DB 복구 스크립트
│   └── data/               # 로컬 개발용 DB 볼륨 마운트 (Git 제외 권장)
├── devops/                 # 인프라 및 CI/CD 설정
│   ├── setup_ci_cd.sh      # CI/CD 환경 초기화 스크립트
│   ├── jenkins/            # Jenkins 관련 설정
│   │   └── Jenkinsfile     # 파이프라인 정의 파일
│   └── docker/             # 컨테이너화 설정
│       ├── docker-compose.yml   # 로컬 개발 환경 실행 정의
│       └── Dockerfiles/         # 서비스별 Dockerfile 모음
│           ├── Dockerfile.auth
│           ├── Dockerfile.core
│           ├── Dockerfile.web
│           └── Dockerfile.db
├── Makefile                # 빌드, 실행, 테스트 자동화 명령어 모음
└── readme.md               # 프로젝트 개요 및 로컬 실행 가이드
