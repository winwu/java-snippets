package example.teashop;

public enum Size {
    MEDIUM, LARGE;
    
    public String toString() {
        switch(this) {
            case MEDIUM:    return "中杯(M)";
            case LARGE:     return "大杯(L)";
            default:        return "未指定";
        }
    }
}
