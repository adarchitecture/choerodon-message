import React, { Fragment } from 'react';
import { TabPage, Content, Breadcrumb } from '@choerodon/boot';
import { Table, CheckBox } from 'choerodon-ui/pro';
import { useAgileContentStore } from './stores';

import './index.less';

const { Column } = Table;

export default props => {
  const {
    intlPrefix,
    prefixCls,
    intl: { formatMessage },
    tableDs,
  } = useAgileContentStore();

  function handlePmHeaderChange(value) {
    tableDs.forEach((record) => record.set('pmEnable', value));
  }

  function handlePmChange(value) {
    const record = tableDs.current;
    record.set('pmEnable', value);
  }
  
  function renderPmHeader(dataSet) {
    const isChecked = tableDs.totalCount && !tableDs.find((record) => !record.get('pmEnable'));
    const pmRecords = tableDs.find((record) => record.get('pmEnable'));
    return (
      <CheckBox
        checked={isChecked}
        indeterminate={!!pmRecords}
        onChange={handlePmHeaderChange}
      >
        {formatMessage({ id: `${intlPrefix}.pmEnable` })}
      </CheckBox>
    );
  }

  function renderPm({ record, value }) {
    return (
      <CheckBox
        record={record}
        name="pmEnable"
        checked={value}
        // onChange={handlePmChange}
      />
    );
  }

  return (
    <Fragment>
      <Breadcrumb />
      <Content className={`${prefixCls}-agile-content`}>
        <Table dataSet={tableDs}>
          <Column name="name" />
          <Column name="pmEnable" header={renderPmHeader} renderer={renderPm} align="left" />
          <Column name="targetUserDTOS" />
        </Table>
      </Content>
    </Fragment>
  );
};
