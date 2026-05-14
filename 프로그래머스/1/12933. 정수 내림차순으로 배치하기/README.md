# [level 1] 정수 내림차순으로 배치하기 - 12933 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12933) 

### 회고
배열을 정렬할 때 Arrays.sort((T[] a, Comparator<? super T> c)) Comparator 를 사용하여 오름, 내림 차순 파라미터를 주고 싶을 땐 제너릭이 들어가서 참조 타입만 받을 수 있다.

원시 타입: {int, long, char, double, boolean, byte,  short, float}

참조 타입: {Integer, Long, Character, Double, Boolean, Byte, Short, Float}

### 성능 요약

메모리: 63.3 MB, 시간: 0.34 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 05월 14일 11:22:24

### 문제 설명

<p>함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.</p>

<h5>제한 조건</h5>

<ul>
<li><code>n</code>은 1이상 8000000000 이하인 자연수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th style="text-align: center">return</th>
</tr>
</thead>
        <tbody><tr>
<td>118372</td>
<td style="text-align: center">873211</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
