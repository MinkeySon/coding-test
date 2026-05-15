# [level 1] 정수 제곱근 판별 - 12934 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12934) 

### 회고
부동소수점을 조심해야 하는 문제.

Math.sqrt() -> 반복적 근사 알고리즘으로 계산하기 때문에 원하는 정수가 나오지 않을 수 있다.

ex. Math.sqrt(121) -> 11 로 생각하지만, 10.9999999... 가 나올수도 있다는 말이다. 이를 long 으로 타입 변환 할 경우 11이 아닌 10 으로 떨어져 계산이 맞지 않다.

때문에, 이러한 부동소수점 오류가 발생할 수 있는 경우 나눗젬, 제곱근과 같은 연산과 double/float 타입 변수의 사용을 지양해야 한다.

### 성능 요약

메모리: 63.8 MB, 시간: 0.13 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 05월 15일 13:35:35

### 문제 설명

<p>임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.<br>
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.</p>

<h5>제한 사항</h5>

<ul>
<li>n은 1이상,  50000000000000 이하인 양의 정수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th style="text-align: center">return</th>
</tr>
</thead>
        <tbody><tr>
<td>121</td>
<td style="text-align: center">144</td>
</tr>
<tr>
<td>3</td>
<td style="text-align: center">-1</td>
</tr>
</tbody>
      </table>
<h6>입출력 예 설명</h6>

<p><strong>입출력 예#1</strong><br>
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.</p>

<p><strong>입출력 예#2</strong><br>
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
