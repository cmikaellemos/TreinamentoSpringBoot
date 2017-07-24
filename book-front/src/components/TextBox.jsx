import React from 'react';
import PropTypes from 'prop-types';

import './TextBox.css';

const propTypes = {
    name : PropTypes.string, 
    onChange : PropTypes.func,
};

const defaultProps = {
    name: '',
    onChange : Function.prototype,
};

function TextBox(props) {
    /** @param e {Event} */
    
    const handleChange = e => {
        e.preventDefault();
        e.stopPropagation();
        props.onChange()

    };

    return (
        <div> 
            <span>{props.name}</span>
            <input type="text" className={TextBoxClass} onChange={handleChange}>
                {props.caption}
            </input>
        </div>
    );
}


TextBox.propTypes = propTypes;
TextBox.defaultProps = defaultProps;

export default TextBox;

