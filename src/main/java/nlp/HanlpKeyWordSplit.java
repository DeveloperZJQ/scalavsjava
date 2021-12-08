package nlp;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;
import java.util.Objects;

/**
 * hanlp 分词
 *
 * @author happy
 * @since 2021-11-30
 */
public class HanlpKeyWordSplit {
    public static void main(String[] args) {
        System.out.println("1-->" + HanLP.segment("你好，欢迎使用HanLP汉语处理包！"));
        Term term = HanLP.segment("你好，欢迎使用HanLP汉语处理包！").get(0);
        String tr = "你好，欢迎使用HanLP汉语处理包";
        List<String> strings = HanLP.extractKeyword(tr, 3);

        System.out.println(strings.size());
        if (strings.size() == 0) {
            return;
        }

        System.out.println(strings.get(0));

        if (strings.size() >= 2) {
            System.out.println(strings.get(1));
        }
        if (strings.size() == 3) {
            System.out.println(strings.get(2));
        }
    }
}
