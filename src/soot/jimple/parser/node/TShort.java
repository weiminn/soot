package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class TShort extends Token
{
    public TShort()
    {
        super.setText("short");
    }

    public TShort(int line, int pos)
    {
        super.setText("short");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TShort(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTShort(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TShort text.");
    }
}
