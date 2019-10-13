package thotd.constants;

import java.util.Arrays;
import java.util.List;

public class PathConstant {
    public static final String PACKED_GENERATED_NAME = "thotd.generated";

    public static final String CONFIG_XML_DOMAIN = "assests/configs/xml/domain.xml";
    public static final String CONFIG_XML = "assests/configs/xml/network-operators.xml";
    public static final String CONFIG_XSL_SODEPAMI = "assests/configs/xsl/sodepami.xsl";

    public static final List<String> CONFIG_SCHEMAS = Arrays.asList(
            "web/assests/configs/xsd/sim.xsd",
            "web/assests/configs/xsd/tag.xsd",
            "web/assests/configs/xsd/network-operator.xsd",
            "web/assests/configs/xsd/network-operators.xsd"
    );

    /**
     * Order configs
     *
     * Work for with:
     *  - Simsovietnam
     *
     *  Got 403 with:
     *  - Giaosimnhanh
     */
    public static final String CONFIG_ORDERS_XML= "assests/configs/xml/orders.xml";
    public static final String CONFIG_ORDERS_XSL_SIMSOVIETNAM = "assests/configs/xsl/orders/simsovietnam.xsl";
    public static final String CONFIG_ORDERS_XSL_GIAOSIMNHANH = "assests/configs/xsl/orders/giaosimnhanh.xsl";
    public static final String CONFIG_ORDERS_XSL_KHOSIM = "assests/configs/xsl/orders/khosim.xsl";
    public static final List<String> CONFIG_ORDERS_XSL = Arrays.asList(
            CONFIG_ORDERS_XSL_SIMSOVIETNAM,
            CONFIG_ORDERS_XSL_KHOSIM
            // CONFIG_ORDERS_XSL_GIAOSIMNHANH
    );

    public static final List<String> CONFIG_ORDERS_SCHEMAS = Arrays.asList(
            "web/assests/configs/xsd/orders/order.xsd",
            "web/assests/configs/xsd/orders/orders.xsd"
    );

}
