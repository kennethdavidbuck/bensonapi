package com.kennethbuck.bensonapi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/**")
    public String index() {

        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<meta charset=\"utf-8\">\n" +
                "\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "\t<title>Kenneth Buck</title>\n" +
                "\t<meta name=\"description\" content=\"\">\n" +
                "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "\n" +
                "\t<base href=\"/\" />\n" +
                "<meta name=\"benson/config/environment\" content=\"%7B%22modulePrefix%22%3A%22benson%22%2C%22environment%22%3A%22production%22%2C%22baseURL%22%3A%22/%22%2C%22locationType%22%3A%22auto%22%2C%22EmberENV%22%3A%7B%22FEATURES%22%3A%7B%7D%7D%2C%22APP%22%3A%7B%22name%22%3A%22benson%22%2C%22version%22%3A%220.0.0+02ba6a28%22%7D%2C%22analyticskit%22%3A%7B%22providers%22%3A%5B%22google%22%5D%2C%22google%22%3A%7B%22trackingId%22%3A%22UA-75008396-1%22%7D%7D%2C%22ember-cli-mirage%22%3A%7B%22enabled%22%3Afalse%2C%22usingProxy%22%3Afalse%2C%22useDefaultPassthroughs%22%3Atrue%7D%2C%22contentSecurityPolicyHeader%22%3A%22Content-Security-Policy-Report-Only%22%2C%22contentSecurityPolicy%22%3A%7B%22default-src%22%3A%22%27none%27%22%2C%22script-src%22%3A%22%27self%27%22%2C%22font-src%22%3A%22%27self%27%22%2C%22connect-src%22%3A%22%27self%27%22%2C%22img-src%22%3A%22%27self%27%22%2C%22style-src%22%3A%22%27self%27%22%2C%22media-src%22%3A%22%27self%27%22%7D%2C%22exportApplicationGlobal%22%3Afalse%7D\" />\n" +
                "<script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)})(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create','UA-75008396-1','auto');</script>\n" +
                "\n" +
                "\t<link rel=\"stylesheet\" href=\"https://s3.amazonaws.com/www.kennethbuck.ca/benson/builds/0.0.0-02ba6a2/assets/vendor-d41d8cd98f00b204e9800998ecf8427e.css\">\n" +
                "\t<link rel=\"stylesheet\" href=\"https://s3.amazonaws.com/www.kennethbuck.ca/benson/builds/0.0.0-02ba6a2/assets/benson-7201a8d09e5676ab3cf2c323f00512ff.css\">\n" +
                "\n" +
                "\t\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "\n" +
                "<script src=\"https://s3.amazonaws.com/www.kennethbuck.ca/benson/builds/0.0.0-02ba6a2/assets/vendor-0608642e38c4107fd7aeb8bd7e267ef7.js\"></script>\n" +
                "<script src=\"https://s3.amazonaws.com/www.kennethbuck.ca/benson/builds/0.0.0-02ba6a2/assets/benson-0a6f13a89a997395b794592a71cfe39b.js\"></script>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
