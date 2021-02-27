package example.teashop;

public enum Sweetness {
    SUGAR_FREE, LESS_SUGAR, HALF_SUGAR, QUARTER_SUGAR, REGULAR_SUGAR;

    public String toString() {
        switch(this) {
            case SUGAR_FREE:            return "無糖";
            case LESS_SUGAR:            return "少糖";
            case HALF_SUGAR:            return "半糖";
            case QUARTER_SUGAR:         return "微糖";
            case REGULAR_SUGAR:         return "全糖";
            default:                    return "未指定";
        }
    }
}
