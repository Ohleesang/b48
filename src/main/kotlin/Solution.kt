class Solution {
    fun solution(M: Int, N: Int) = M - 1 + (N - 1) * M
}

fun main() {
    val a = Solution()
    a.solution(2, 2) //3
    a.solution(2, 5) //9
    a.solution(1, 1) //0
}