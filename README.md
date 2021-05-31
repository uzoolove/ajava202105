# 멀티캠퍼스 안드로이드 개발자를 위한 Java 과정(2021.05.31 ~ 2021.06.04)
## 개발환경 구축
### 프로그램 설치
* C:\ajava 폴더 생성(본인의 상황에 맞게 적절한 폴더 생성. 이후 경로는 해당 폴더 기준)
* 본인의 OS에 맞는 버전 다운로드 후 설치
1. JDK 설치 [Download Pages](https://jdk.java.net/archive/)(마우스 오른쪽 버튼 > 새 탭에서 링크 열기)
    * C:\ajava 밑에 압축 해제하면 자동으로 c:\ajava\jdk-15.0.2 폴더가 생김
    * 환경변수 등록
      ```
      windows 버튼 + r
      sysdm.cpl ,3
      ```
      - 환경 변수 클릭
      - 시스템 변수 항목의 새로 만들기 클릭
      - 변수 이름: JAVA_HOME
      - 변수 값: c:\ajava\jdk-15.0.2
      - 시스템 변수 항목의 Path 선택 후 편집 클릭
      - %JAVA_HOME%\bin\ 추가
      - 확인 버튼 눌러서 열린창 모두 닫은 후 다음 명령 입력해서 java 버전이 표시되면 정상 완료
      ```
      windows 버튼 + r
      cmd
      java -version
      ```
2. Eclipse 설치 [Download Pages](https://www.eclipse.org/downloads/)(마우스 오른쪽 버튼 > 새 탭에서 링크 열기)
    * 다운로드 받은 파일 실행 후 Eclipse IDE for Java Developers 선택
    * Installation Folder: C:\ajava\eclipse 지정 후 INSTALL 선택
    * 설정
      - 최초 실행 시 Select a directory as workspace 선택 항목에서 C:\ajava\java-workspace 입력, Use this as the default and do not ask again 선택박스 선택
      - 이클립스 실행 후 환경 설정
        - Window > Preferences > General > Appearance > Colors and Fonts > Basic > Text Font 선택 후 Edit로 원하는 글꼴 및 크기 선택
        - Window > Preferences > General > Content Types > Text > Java Class File 선택 후 Default encoding에 UTF-8 입력 후 Update 선택
        - Window > Preferences > General > Content Types > Text 선택 후 Default encoding에 UTF-8 입력 후 Update 선택        

3. Android Studio 설치 [Download Pages](https://developer.android.com/studio)(마우스 오른쪽 버튼 > 새 탭에서 링크 열기)
    * 다운로드 받은 파일 실행해서 설치
    * 설치 중 경로는 C:\ajava\Android Studio로 지정, 나머지는 기본옵션 그대로 설치
    * 설정
      - 설치 완료 후 실행
      - Import Android Studio Settings 항목에서 Do not import settings 선택
      - Android Studio Setup Wizard 진행하면서 Install Type에서 Custom 선택
      - Select default JDK Location 항목에서 JAVA_HOME 선택
      - SDK Components Setup 항목에서 Android SDK Location을 C:\ajava\adk로 지정
      - 나머지는 모두 기본 옵션으로 선택 후 완료
## 소스코드 공유(본인의 소스코드를 강사에게 공유하고 싶을때)
1. [Code Share](https://codeshare.io/) 접속(마우스 오른쪽 버튼 > 새 탭에서 링크 열기)
2. Share Code Now 클릭
3. 본인의 코드 복사
4. 브라우저의 주소창의 URL 복사 후 채팅창에 붙여넣기

