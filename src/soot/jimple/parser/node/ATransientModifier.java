package soot.jimple.parser.node;

import java.util.*;
import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class ATransientModifier extends PModifier
{
    private TTransient _transient_;

    public ATransientModifier()
    {
    }

    public ATransientModifier(
        TTransient _transient_)
    {
        setTransient(_transient_);

    }
    public Object clone()
    {
        return new ATransientModifier(
            (TTransient) cloneNode(_transient_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATransientModifier(this);
    }

    public TTransient getTransient()
    {
        return _transient_;
    }

    public void setTransient(TTransient node)
    {
        if(_transient_ != null)
        {
            _transient_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _transient_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_transient_);
    }

    void removeChild(Node child)
    {
        if(_transient_ == child)
        {
            _transient_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_transient_ == oldChild)
        {
            setTransient((TTransient) newChild);
            return;
        }

    }
}
