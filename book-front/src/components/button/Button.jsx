import React from 'react';
import PropTypes from 'prop-types';

import './Button.css';

const propTypes = {
    type : PropTypes.oneOf(['info', 'danger', 'success']),
    caption : PropTypes.string.isRequired,
    onClick : PropTypes.func,
};

const defaultProps = {
    type : 'info',
    onClick : Function.prototype,
};

function Button(props) {
    const buttonClass = `button button-${props.type}`;
    /** @param e {Event} */
    
    const handleClick = e => {
        e.preventDefault();
        e.stopPropagation();
        props.onClick()
    };

    return (
        <button className={buttonClass} onClick={handleClick}>
            {props.caption}
        </button>
    );
}

function SaveButton(props) {
    return (
        <Button {...props} caption="Salvar" type="success"></Button>
    )
}

function CancelButton(props) {
    return (
        <Button {...props} caption="Cancelar" type="danger"></Button>
    )
}

function OkButton(props) {
    return (
        <Button {...props} caption="Ok" type="success"></Button>
    )
}


Button.propTypes = propTypes;
Button.defaultProps = defaultProps;

Button.Cancel = CancelButton;
Button.Save = SaveButton;
Button.Ok = OkButton;

export default Button;

