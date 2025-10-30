#  📖TodoService Study Riview



---

## 🛠️ 기술 스택
[ 카테고리 ] : [기술] : [ 버전]
1.Language :	Java	:	JDK 17 
2.Web Framework	: Spring Web MVC	 
3.	MyBatis	
4.MySQL
5.HikariCP
6.Gradle
7.Lombok
8.ModelMapper  : DTO ↔ VO 객체 간 변환 지원 
9.Hibernate Validator
10.IntelliJ IDEA
11.Git / GitHub


---

## 📂 프로젝트 구조

```
src/
 ┣ main/
 ┃ ┣ java/
 ┃ ┃ ┗ com.ssg.todoservicejh/
 ┃ ┃   ┣ config/      # Spring 설정 (Configuration)
 ┃ ┃   ┣ controller/  # Controller (사용자 요청 처리)
 ┃ ┃   ┣ domain/      # Model (VO/Entity)
 ┃ ┃   ┣ dto/         # Model (DTO)
 ┃ ┃   ┣ mapper/      # DAO/Repository (MyBatis Mapper Interface)
 ┃ ┃   ┣ service/     # Service Interface (비즈니스 로직 정의)
 ┃ ┃   ┗ serviceImpl/ # Service 구현체 (비즈니스 로직 실제 구현)
 ┃ ┣ resources/
 ┃ ┃ ┣ mapper/        # MyBatis Mapper XML (SQL 쿼리)
 ┃ ┃ ┣ static/        # 정적 파일 (CSS, JS, Image)
 ┃ ┃ ┗ log4j2.xml     # 로깅 설정
 ┃ ┗ webapp/
 ┃   ┣ WEB-INF/
 ┃   ┃ ┣ spring/      # Spring 설정 XML
 ┃   ┃ ┃ ┣ root-context.xml
 ┃   ┃ ┃ ┗ servlet-context.xml
 ┃   ┃ ┗ views/       # View 파일 (.jsp)
 ┃   ┃   ┗ todo/
 ┃   ┗ web.xml        # 웹 애플리케이션 환경 설정
 ┗ test/
   ┗ java/
     ┗ com.ssg.todoservicejh.mapper/ # 테스트 코드 (MapperTests 포함)
---

## 🔀 Git Flow 전략


## ✨ 주요 기능



---


## ⚙️ 확장 포인트

