package ws;

import ciecc.swzf.common.util.CaseConsts;
import ciecc.swzf.zbasecase.service.CaseDTO;
import ciecc.swzf.zbasecase.service.impl.AdditionalRecodingCaseService;
import demo.ws.soap_spring_cxf.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kang
 * @create 2017-09-06 14:03
 */
public class Client {

    public void testHello() {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");

        HelloService service = context.getBean("helloService", HelloService.class);
        String result = service.say("world");
        System.out.println(result);
    }

    @Test
    public void testTransferZBaseCase(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");
        AdditionalRecodingCaseService service = context.getBean("transferZBaseCaseService", AdditionalRecodingCaseService.class);

        CaseDTO baseCase = new CaseDTO();

        baseCase.setTrTunit("福建省福州市天台路贾福建省福州市天");
        baseCase.setTrTunitAddress("福建省福州市天福州市天台路贾福建省福州市天福州市" +
                "市天福州市天台路贾福建省福州市天福州市天台路天台路贾福建省福州市天");
//        baseCase.setTrTunitLegal("比尔~克林顿");
        baseCase.setTrTunitType(CaseConsts.TUNIT_TYPE_BUSINESS);
        baseCase.setReportDate("20107-08-30");
        baseCase.setJieanDate("2017-08-18");
        baseCase.setStage(CaseConsts.STAGE_SIMPLY_PROCEDURE);
//        baseCase.setUserCode("zf50430001");
        baseCase.setCheckResult(CaseConsts.CHECK_RESULT_ILLEGAL);
        baseCase.setAnJianShuoMing("好的福州市天台路贾福建省福州市天福州市天台路贾福建省福州市天");
        baseCase.setTrTunitCheckItem(CaseConsts.CHECK_ITEM_FOREIGN_LABOUR);
        baseCase.setTrType(CaseConsts.TR_TYPE_INSPECTION);
        baseCase.setPunTypeFk(CaseConsts.PUNISH_TYPE_CHECK_TRUE);
        baseCase.setChuFaMoney(95441896986696998989789.36);
        baseCase.setOpManName("万孝波,钟志华");


        String result = service.transferZBaseCase(baseCase);
        System.out.println(result);
    }

}
