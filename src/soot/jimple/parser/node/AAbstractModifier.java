package soot.jimple.parser.node;

import java.util.*;
import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class AAbstractModifier extends PModifier
{
    private TAbstract _abstract_;

    public AAbstractModifier()
    {
    }

    public AAbstractModifier(
        TAbstract _abstract_)
    {
        setAbstract(_abstract_);

    }
    public Object clone()
    {
        return new AAbstractModifier(
            (TAbstract) cloneNode(_abstract_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAbstractModifier(this);
    }

    public TAbstract getAbstract()
    {
        return _abstract_;
    }

    public void setAbstract(TAbstract node)
    {
        if(_abstract_ != null)
        {
            _abstract_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _abstract_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_abstract_);
    }

    void removeChild(Node child)
    {
        if(_abstract_ == child)
        {
            _abstract_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_abstract_ == oldChild)
        {
            setAbstract((TAbstract) newChild);
            return;
        }

    }
}
