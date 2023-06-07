// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

// 제한 조건
// n은 10,000,000,000이하인 자연수입니다

class Solution {
    fun solution(n: Long): IntArray {
        return n.toString().reversed().map { it.toString().toInt()}.toIntArray()
    }
}

// 1) n.toString() : 123 -> "123"
// 2) .reversed() : "123" -> "321"
// 3) .map {} : "321"를 List로 변환
// 4) .map { it.toString().toInt() } : List<Int>를 만들건데 it이 "3" "2" "1" 이므로 이걸 그대로 아스키 코드로 변환하면 안됨 *
// 5) .toIntArray : IntArray로 변환

// * "3", "2", "1"을 바로 아스키 코드로 변환하면 51, 52, 53이 되어버린다.

// 그래서 it.toInt()를 바로 하지 않고 toString()을 중간에 넣어주어야 함