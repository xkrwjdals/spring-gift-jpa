package gift.exception;

public enum ErrorCode {
    MEMBER_NOT_FOUND("해당 사용자를 데이터 베이스에서 찾을 수 없습니다.\nmemberID: %d"),
    PRODUCT_NOT_FOUND("해당 상품 데이터 베이스에서 찾을 수 없습니다.\nproductName: $s"),
    WISHLIST_NOT_FOUND("$s 사용자의 위시 리스트에서 $s 을(를) 찾을 수 없습니다.");

    private final String messageTemplate;

    ErrorCode(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    public String getMessageTemplate() {
        return messageTemplate;
    }

    public String formatMessage(Object... args) {
        return String.format(messageTemplate, args);
    }
}