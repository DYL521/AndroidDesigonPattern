package com.dyl.a02_builder.simple1;


//具体的Builder类，macbookbuilder
public class MacBookBuilder extends Builder {

    private Computer mComputer = new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOs() {
        mComputer.setmOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
