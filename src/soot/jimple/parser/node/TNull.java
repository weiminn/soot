package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class TNull extends Token
{
    public TNull()
    {
        super.setText("null");
    }

    public TNull(int line, int pos)
    {
        super.setText("null");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TNull(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNull(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TNull text.");
    }
}
