package soot.jimple.parser.node;

import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class TVirtualinvoke extends Token
{
    public TVirtualinvoke()
    {
        super.setText("virtualinvoke");
    }

    public TVirtualinvoke(int line, int pos)
    {
        super.setText("virtualinvoke");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TVirtualinvoke(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVirtualinvoke(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TVirtualinvoke text.");
    }
}
