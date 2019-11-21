package com.test;

import com.bailonglong.common.utils.DateUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    @Test
    public void datetest() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateByFullMonth = DateUtil.getDateByFullMonth(format.parse("2019-11-21 10:20:10"));
        System.out.println(format.format(dateByFullMonth));

        Date dateByInitMonth = DateUtil.getDateByInitMonth(format.parse("2019-11-21 10:20:10"));
        System.out.println(format.format(dateByInitMonth));

    }
}
