package example.teashop;

public enum AddOn {
    TAPIOCA, TARO_BALL, EGG_PUDDING, RED_BEAN, ALMOND_JELLY, NO;
    
    public String toString() {
        switch(this) {
            case TAPIOCA:       return "珍珠";
            case TARO_BALL:     return "芋圓";
            case EGG_PUDDING:   return "布丁";
            case RED_BEAN:      return "紅豆";
            case ALMOND_JELLY:  return "杏仁凍";
            case NO:            return "不需要加料";   
            default:            return "未指定";
        }
    }
}
