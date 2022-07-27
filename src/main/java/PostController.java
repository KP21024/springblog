import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @RequestMapping("/posts")

    @GetMapping
    @ResponseBody
    public String postsIndex() {
        return "Post Index page";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String postView(long id) {
        return "View individual post";
    }

    @GetMapping("/create")
    @ResponseBody
    public String createAPost() {
        return "View for form to create a post";
    }

    @PostMapping("/create")
    @ResponseBody
    public String ccreateANewPost() {
        return "View for creating a new post";
    }
}
