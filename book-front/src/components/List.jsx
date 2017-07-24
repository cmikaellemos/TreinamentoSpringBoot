import React from 'react';
import PropTypes from 'prop-types';

import './List.css';

const propTypes = {
    items : PropTypes.arrayOf({items}),
    keyProp : PropTypes.string.isRequired,
    selectedKey : PropTypes.string
};

const defaultProps = {
    items: [],
};

function List(props) {
    const template = React.Children.only(props.children)
    return (
        <ul className="list">
            {props.items.map( (item) => (
                <li
                 key={item[props.keyProp]}
                 className={item[props.keyProp] === selectedKey ? "selected-item" : ''}
                 >
                 {template}
                 </li>
            ))}

        </ul>
    );
}


List.propTypes = propTypes;
List.defaultProps = defaultProps;

export default List;

