import React from 'react';

const propTypes = {
    prop : React.PropTypes.string,
};

const defaultProps = {
    prop: '',
};

function Form(props) {
    return (
        <form>
            <Label type="header">Título</Label>
            {props.children}
        </form>
    );
}

Form.propTypes = propTypes;
Form.defaultProps = defaultProps;

export default Form;

