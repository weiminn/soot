package soot.jimple.parser.node;

import java.util.*;
import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class AMinusBinop extends PBinop
{
    private TMinus _minus_;

    public AMinusBinop()
    {
    }

    public AMinusBinop(
        TMinus _minus_)
    {
        setMinus(_minus_);

    }
    public Object clone()
    {
        return new AMinusBinop(
            (TMinus) cloneNode(_minus_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusBinop(this);
    }

    public TMinus getMinus()
    {
        return _minus_;
    }

    public void setMinus(TMinus node)
    {
        if(_minus_ != null)
        {
            _minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _minus_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_minus_);
    }

    void removeChild(Node child)
    {
        if(_minus_ == child)
        {
            _minus_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
            return;
        }

    }
}
