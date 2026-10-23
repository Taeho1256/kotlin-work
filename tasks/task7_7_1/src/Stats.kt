// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    require(data.isNotEmpty())

    val sorted = data.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2
    } else {
        sorted[middle]
    }
}