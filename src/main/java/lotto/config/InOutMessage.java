package lotto.config;

public enum InOutMessage {
    PURCHASE_COST_MESSAGE("구입금액을 입력해 주세요.\n"),
    PURCHASE_QUATITY_MESSAGE("개를 구매했습니다.\n"),
    WINNING_NUMBER_MESSAGE("당첨 번호를 입력해 주세요.\n"),
    BONUS_NUMBER_MESSAGE("보너스 번호를 입력해 주세요.\n");

    private final String message;
    private InOutMessage(String str) {
        this.message = str;
    }
    public String getMessage() {
        return message;
    }
}
