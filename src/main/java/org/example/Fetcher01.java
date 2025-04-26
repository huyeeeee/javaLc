package org.example;

public class Fetcher01 extends Fetcher{
    @Override
    public DataModel fetch(Context context) {
        DataModel hotelId = context.getDataModel().getMap().get(context.mainKey);
        // 查询rpc
        return new DataModel();
    }
}
