package soot.jimple.parser.node;

import java.util.*;
import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class AUshrBinop extends PBinop
{
    private TUshr _ushr_;

    public AUshrBinop()
    {
    }

    public AUshrBinop(
        TUshr _ushr_)
    {
        setUshr(_ushr_);

    }
    public Object clone()
    {
        return new AUshrBinop(
            (TUshr) cloneNode(_ushr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUshrBinop(this);
    }

    public TUshr getUshr()
    {
        return _ushr_;
    }

    public void setUshr(TUshr node)
    {
        if(_ushr_ != null)
        {
            _ushr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _ushr_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_ushr_);
    }

    void removeChild(Node child)
    {
        if(_ushr_ == child)
        {
            _ushr_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_ushr_ == oldChild)
        {
            setUshr((TUshr) newChild);
            return;
        }

    }
}
