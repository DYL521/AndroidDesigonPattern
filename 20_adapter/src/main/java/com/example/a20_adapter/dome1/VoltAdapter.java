package com.example.a20_adapter.dome1;

/**
 * @author DYL 2182
 *
 *  Adapter ,将220转换城5v
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
