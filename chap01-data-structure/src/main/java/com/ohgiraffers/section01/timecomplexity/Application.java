package com.ohgiraffers.section01.timecomplexity;

import java.util.Arrays;

public class Application {

    /* 시간 복잡도란?
     *   - 알고리즘(로직) 해결하는데 걸리는 시간의 양을 나타내는 척도
     *   - 입력 크기(n)에 대한 함수로 표현
     *   - Big-O 표기법을 사용하여 최악의 경우를 나타냄
     *   - 특정 알고리즘이 대규모 데이터 셋에서 얼마나 잘 동작할지 예측하는게 중요함
     * */
    public static void main(String[] args) {
        // 테스트용 정수 배열 선언 및 초기화
        int[] arr = {3,1,2,15,5,6,3,4,2,34,6,2,5,5,2,45,52,3,423,4634,6,234,23,4,};
        System.out.println("getFirst(arr) = " + getFirst(arr));

        arr = reverse(arr); // arr == result
        System.out.println("reverse(arr) = " + Arrays.toString(arr));
    }

    /* 상수 시간 BigO(1)
     *   - 입력된 크기와 관련 없이 코드 실행 시간이 일정한 경우를 의미합니다
     * */
    private static int getFirst(int[] arr) {
        // 입력된 배열의 크기가 아무리 커지더라도 연산은 딱 한 번만 수행됨
        // == 입력 크기가 실행 시간에 영향을 주지 않는다
        return arr[0] + arr[1];
    }

    /* 선형 시간 BigO(n)
     *   - 입력 크기(n)에 비례하여 실행 시간이 증가하는 경우를 의미
     *   - 흔한 예시 : 배열 / 리스트 순회
     * */
    private static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        // reverse 로직
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }

        return result;
    }

    /* 로그 시간 O(log n)
    *   -  입력 크기(n)가 증가할 때, 실행 시간이 로그 함수적으로 증가하는 경우를 의미
    * */
    




}
