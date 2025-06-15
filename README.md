<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="javaproject_0"></a>javaproject</h1>
<p class="has-line-data" data-line-start="1" data-line-end="2">자바 중간 프로젝트</p>
<h1 class="code-line" data-line-start=3 data-line-end=4 ><a id="_____3"></a>자바를 이용한 스케줄 관리 프로그램</h1>
<hr>
<h3 class="code-line" data-line-start=5 data-line-end=6 ><a id="__5"></a>🪄프로젝트 소개</h3>
<p class="has-line-data" data-line-start="6" data-line-end="7">이 프로그램은 사용자별로 일정을 입력받아 한눈에 보기 쉽게 일정을 관리 할 수 있도록 만들어진 프로그램입니다.</p>
<h4 class="code-line" data-line-start=7 data-line-end=8 ><a id="_7"></a>✨구현기능</h4>
<ol>
<li class="has-line-data" data-line-start="10" data-line-end="11"><strong>사용자 아이디를 입력</strong></li>
</ol>
<ul>
<li class="has-line-data" data-line-start="11" data-line-end="12">만약 사용자 아이디가 존재하지 않는다면, 아이디를 만들도록 문구가 뜬다.</li>
<li class="has-line-data" data-line-start="12" data-line-end="14">이미 존재하는 아이디를 입력할 시 메뉴선택화면으로 넘어간다.<br><br>
<img src="https://github.com/user-attachments/assets/4e491b4a-5288-46e2-a9f4-5a5e8c3680a6" alt="Image"></li>
</ul>
<br>
<br>
<ol start="2">
<li class="has-line-data" data-line-start="19" data-line-end="20"><strong>이벤트 추가</strong></li>
</ol>
<ul>
<li class="has-line-data" data-line-start="20" data-line-end="21">이벤트 제목, 이벤트 시작시간, 이벤트 종료시간, 세부사항 입력</li>
<li class="has-line-data" data-line-start="21" data-line-end="23">잘못된 형식으로 날짜를 입력하거나, 종료 날짜가 시작 날짜보다 빠를 때 경고 메세지 출력<br><br>
<img src="https://github.com/user-attachments/assets/928ac1c8-fac3-433d-b9fc-b9a43519471a" alt="Image"></li>
</ul>
<br>
<br>
<ol start="3">
<li class="has-line-data" data-line-start="27" data-line-end="29"><strong>달력조회</strong></li>
</ol>
<ul>
<li class="has-line-data" data-line-start="29" data-line-end="30">년과 월을 입력받아서 달력을 출력</li>
<li class="has-line-data" data-line-start="30" data-line-end="32">이벤트가 있는 날에만 소괄호로 이벤트 개수 출력<br><br>
<img src="https://github.com/user-attachments/assets/cd282210-b91a-4a80-87a5-86992730b0bc" alt="Image"></li>
</ul>
<br>
<br>
<ol start="4">
<li class="has-line-data" data-line-start="37" data-line-end="39"><strong>이벤트 조회</strong></li>
</ol>
<ul>
<li class="has-line-data" data-line-start="39" data-line-end="40">yyyy/MM/dd 형식으로 입력시 그 날짜에 해당하는 일정을 출력</li>
</ul>
<br>
<br>
<ol start="5">
<li class="has-line-data" data-line-start="42" data-line-end="44"><strong>이벤트 변경</strong></li>
</ol>
<ul>
<li class="has-line-data" data-line-start="44" data-line-end="45">변경할 날짜를 yyyy/MM/dd 형식으로 입력하면 해당 날짜의 일정들이 추가 순서대로 출력된다.</li>
<li class="has-line-data" data-line-start="45" data-line-end="46">수정할 일정 번호선택 메시지가 출력된다. (사용자가 번호 입력)</li>
<li class="has-line-data" data-line-start="46" data-line-end="47">입력 번호에 해당하는 수정 내용이 출력되며 변경할 이벤트가 맞는지 확인 문자가 출력된다.</li>
<li class="has-line-data" data-line-start="47" data-line-end="48">사용자는 변경하려면 문자 y 또는 Y를 입력한다.</li>
<li class="has-line-data" data-line-start="48" data-line-end="49">IF&gt; Y or y 입력시 -&gt; 변경 제목, 변경시작시간, 변경종료시간 순으로 입력하도록 메시지 출력, 모두 입력완료시 “이벤트 변경 저장 완료” 메시지 출력</li>
<li class="has-line-data" data-line-start="49" data-line-end="51">ELSE&gt; 만약 다른 문자 입력시 이벤트 변경을 중단하고 메뉴번호 입력으로 RETURN된다.<br><br>
<img src="https://github.com/user-attachments/assets/54a1dee1-0b89-4df9-8ffd-d9dbe998a429" alt="Image"></li>
</ul>
<br>
<br>
<ol start="6">
<li class="has-line-data" data-line-start="55" data-line-end="57"><strong>이벤트 삭제</strong></li>
</ol>
<ul>
<li class="has-line-data" data-line-start="57" data-line-end="58">삭제할 날짜를 yyyy/MM/dd 형식으로 입력하면 해당 날짜의 일정들이 추가 순서대로 출력된다.</li>
<li class="has-line-data" data-line-start="58" data-line-end="59">삭제할 일정 번호선택 메시지가 출력된다. (사용자가 번호 입력)</li>
<li class="has-line-data" data-line-start="59" data-line-end="60">입력 번호에 해당하는 삭제 내용이 출력되며 삭제할 이벤트가 맞는지 확인 문자가 출력된다.</li>
<li class="has-line-data" data-line-start="60" data-line-end="61">사용자는 변경하려면 문자 y 또는 Y를 입력한다.</li>
<li class="has-line-data" data-line-start="61" data-line-end="62">IF&gt; Y or y 입력시 -&gt; 삭제 이벤트 내용이 한번 더 출력되며 “이벤트 삭제 저장 완료” 메시지를 출력</li>
<li class="has-line-data" data-line-start="62" data-line-end="64">ELSE&gt; 만약 다른 문자 입력시 이벤트 삭제를 중단하고 메뉴번호 입력으로 RETURN된다.<br><br>
<img src="https://github.com/user-attachments/assets/425be251-13f7-45df-85cb-c204bbb05c91" alt="Image"></li>
</ul>
