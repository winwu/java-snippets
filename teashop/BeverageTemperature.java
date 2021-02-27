package example.teashop;

public enum BeverageTemperature {
    HOT, WARM, ICE_FREE, EASY_ICE, LESS_ICE, REGULAR_ICE;

    public String toString() {
        switch(this) {
            case HOT:           return "熱的";
            case WARM:          return "溫的";
            case ICE_FREE:      return "去冰";
            case EASY_ICE:      return "微冰";
            case LESS_ICE:      return "少冰";
            case REGULAR_ICE:   return "正常冰";
            default:            return "未指定";
        }
    }
}
