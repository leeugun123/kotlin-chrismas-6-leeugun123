package chrismas.ExceptionMangement

import chrismas.Data.MenuPrice
import chrismas.Data.UserInputData

object ExceptionHandle {

    private const val ERROR = "[ERROR]"
    private const val INPUT_AGAIN = "다시 입력해 주세요."
    private const val WRONG_DATE = "$ERROR 유효하지 않는 날짜입니다.$INPUT_AGAIN"
    private const val INVALID_FORMAT = "$ERROR 잘못된 형식입니다.$INPUT_AGAIN"
    private const val INVALID_MENU_ORDER = "$ERROR 유효하지 않은 주문입니다.$INPUT_AGAIN"
    private const val ONLY_ORDER_BEVERAGE = "$ERROR 음료수만 주문 할 수는 없습니다.$INPUT_AGAIN"
    private const val EXCESS_ORDER_COUNT = "$ERROR 주문 개수를 20개를 넘어서 주문 할 수는 없습니다.$INPUT_AGAIN"

    fun checkDate(date : String){
        require(checkValidDate(date)){ INVALID_FORMAT}
        require(checkDateInRange(date)){ WRONG_DATE}
    }


    private fun checkValidDate(date : String) = date.toIntOrNull() != null

    private fun checkDateInRange(date : String) = date.toInt() in 1..31



}