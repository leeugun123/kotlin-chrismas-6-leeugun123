package chrismas.View

class OrderUI {
    fun orderProcess() {
        InputView().readInfo()
        DataController().analysisData()
        OutputView().outputStart()

        //테스트
    }

}