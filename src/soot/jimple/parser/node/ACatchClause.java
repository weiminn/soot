package soot.jimple.parser.node;

import java.util.*;
import ca.mcgill.sable.util.*;
import soot.jimple.parser.analysis.*;

public final class ACatchClause extends PCatchClause
{
    private TCatch _catch_;
    private PClassName _name_;
    private TFrom _from_;
    private PLabelName _fromLabel_;
    private TTo _to_;
    private PLabelName _toLabel_;
    private TWith _with_;
    private PLabelName _withLabel_;
    private TSemicolon _semicolon_;

    public ACatchClause()
    {
    }

    public ACatchClause(
        TCatch _catch_,
        PClassName _name_,
        TFrom _from_,
        PLabelName _fromLabel_,
        TTo _to_,
        PLabelName _toLabel_,
        TWith _with_,
        PLabelName _withLabel_,
        TSemicolon _semicolon_)
    {
        setCatch(_catch_);

        setName(_name_);

        setFrom(_from_);

        setFromLabel(_fromLabel_);

        setTo(_to_);

        setToLabel(_toLabel_);

        setWith(_with_);

        setWithLabel(_withLabel_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new ACatchClause(
            (TCatch) cloneNode(_catch_),
            (PClassName) cloneNode(_name_),
            (TFrom) cloneNode(_from_),
            (PLabelName) cloneNode(_fromLabel_),
            (TTo) cloneNode(_to_),
            (PLabelName) cloneNode(_toLabel_),
            (TWith) cloneNode(_with_),
            (PLabelName) cloneNode(_withLabel_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACatchClause(this);
    }

    public TCatch getCatch()
    {
        return _catch_;
    }

    public void setCatch(TCatch node)
    {
        if(_catch_ != null)
        {
            _catch_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _catch_ = node;
    }

    public PClassName getName()
    {
        return _name_;
    }

    public void setName(PClassName node)
    {
        if(_name_ != null)
        {
            _name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _name_ = node;
    }

    public TFrom getFrom()
    {
        return _from_;
    }

    public void setFrom(TFrom node)
    {
        if(_from_ != null)
        {
            _from_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _from_ = node;
    }

    public PLabelName getFromLabel()
    {
        return _fromLabel_;
    }

    public void setFromLabel(PLabelName node)
    {
        if(_fromLabel_ != null)
        {
            _fromLabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _fromLabel_ = node;
    }

    public TTo getTo()
    {
        return _to_;
    }

    public void setTo(TTo node)
    {
        if(_to_ != null)
        {
            _to_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _to_ = node;
    }

    public PLabelName getToLabel()
    {
        return _toLabel_;
    }

    public void setToLabel(PLabelName node)
    {
        if(_toLabel_ != null)
        {
            _toLabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _toLabel_ = node;
    }

    public TWith getWith()
    {
        return _with_;
    }

    public void setWith(TWith node)
    {
        if(_with_ != null)
        {
            _with_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _with_ = node;
    }

    public PLabelName getWithLabel()
    {
        return _withLabel_;
    }

    public void setWithLabel(PLabelName node)
    {
        if(_withLabel_ != null)
        {
            _withLabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _withLabel_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_catch_)
            + toString(_name_)
            + toString(_from_)
            + toString(_fromLabel_)
            + toString(_to_)
            + toString(_toLabel_)
            + toString(_with_)
            + toString(_withLabel_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_catch_ == child)
        {
            _catch_ = null;
            return;
        }

        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

        if(_from_ == child)
        {
            _from_ = null;
            return;
        }

        if(_fromLabel_ == child)
        {
            _fromLabel_ = null;
            return;
        }

        if(_to_ == child)
        {
            _to_ = null;
            return;
        }

        if(_toLabel_ == child)
        {
            _toLabel_ = null;
            return;
        }

        if(_with_ == child)
        {
            _with_ = null;
            return;
        }

        if(_withLabel_ == child)
        {
            _withLabel_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_catch_ == oldChild)
        {
            setCatch((TCatch) newChild);
            return;
        }

        if(_name_ == oldChild)
        {
            setName((PClassName) newChild);
            return;
        }

        if(_from_ == oldChild)
        {
            setFrom((TFrom) newChild);
            return;
        }

        if(_fromLabel_ == oldChild)
        {
            setFromLabel((PLabelName) newChild);
            return;
        }

        if(_to_ == oldChild)
        {
            setTo((TTo) newChild);
            return;
        }

        if(_toLabel_ == oldChild)
        {
            setToLabel((PLabelName) newChild);
            return;
        }

        if(_with_ == oldChild)
        {
            setWith((TWith) newChild);
            return;
        }

        if(_withLabel_ == oldChild)
        {
            setWithLabel((PLabelName) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
