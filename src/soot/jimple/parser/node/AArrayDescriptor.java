package soot.jimple.parser.node;

import java.util.*;
import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class AArrayDescriptor extends PArrayDescriptor
{
    private TLBracket _lBracket_;
    private PImmediate _immediate_;
    private TRBracket _rBracket_;

    public AArrayDescriptor()
    {
    }

    public AArrayDescriptor(
        TLBracket _lBracket_,
        PImmediate _immediate_,
        TRBracket _rBracket_)
    {
        setLBracket(_lBracket_);

        setImmediate(_immediate_);

        setRBracket(_rBracket_);

    }
    public Object clone()
    {
        return new AArrayDescriptor(
            (TLBracket) cloneNode(_lBracket_),
            (PImmediate) cloneNode(_immediate_),
            (TRBracket) cloneNode(_rBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayDescriptor(this);
    }

    public TLBracket getLBracket()
    {
        return _lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if(_lBracket_ != null)
        {
            _lBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBracket_ = node;
    }

    public PImmediate getImmediate()
    {
        return _immediate_;
    }

    public void setImmediate(PImmediate node)
    {
        if(_immediate_ != null)
        {
            _immediate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _immediate_ = node;
    }

    public TRBracket getRBracket()
    {
        return _rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if(_rBracket_ != null)
        {
            _rBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBracket_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lBracket_)
            + toString(_immediate_)
            + toString(_rBracket_);
    }

    void removeChild(Node child)
    {
        if(_lBracket_ == child)
        {
            _lBracket_ = null;
            return;
        }

        if(_immediate_ == child)
        {
            _immediate_ = null;
            return;
        }

        if(_rBracket_ == child)
        {
            _rBracket_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if(_immediate_ == oldChild)
        {
            setImmediate((PImmediate) newChild);
            return;
        }

        if(_rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

    }
}
