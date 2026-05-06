fun main() {
    val signalcase_1 = Signal(91, 85, 25, 20, 13)
    check(Policy.score(signalcase_1) == 123)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(94, 88, 24, 19, 5)
    check(Policy.score(signalcase_2) == 124)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(98, 85, 20, 7, 9)
    check(Policy.score(signalcase_3) == 217)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(47, 43, 18, 52)
    check(DomainReviewLens.score(domainReview) == 135)
    check(DomainReviewLens.lane(domainReview) == "watch")
}
