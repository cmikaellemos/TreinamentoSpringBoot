import React from 'react';
import PropTypes from 'prop-types';

import './LinkButton.css';

const propTypes = {
    caption : PropTypes.string.isRequired,
    onClick : PropTypes.func,
};

const defaultProps = {
    onClick : Function.prototype,
};

function LinkButton(props) {
     const handleClick = e => {
        e.preventDefault();
        e.stopPropagation();
        props.onClick()
    };

    return (
        <a
            href=""
            className="button button-link"
            onClick={handleClick} > {props.caption}
        </a>
    );
}

LinkButton.propTypes = propTypes;
LinkButton.defaultProps = defaultProps;

export default LinkButton;

