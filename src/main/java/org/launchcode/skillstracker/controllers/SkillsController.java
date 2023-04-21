package org.launchcode.skillstracker.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class SkillsController {

    @GetMapping("")
    public String getLanguages () {
        return  "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("/form")
    public String getForm () {
        return "<html>" +
                "<body>" +
                "<form method = 'post' action = '/user'>" +
                "<label for='name'>Name</label>" +
                "<input type='text' name='name' id='name'>" +
                "<br>" +
                "<label for='first'>My favorite language:</label>" +
                "<select id='first' name='first'>" +
                "   <option value='java'>Java</option>" +
                "   <option value='javascript'>Javascript</option>" +
                "   <option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='second'>My second favorite language</label>" +
                "<select id='second' name='second'>" +
                "   <option value='java'>Java</option>" +
                "   <option value='javascript'>Javascript</option>" +
                "   <option value='python'>Python</option>" +
                "</select>" +
                "</br>" +
                "<label for='third'>My third favorite language</label>" +
                "<select id='third' name='third'>" +
                "   <option value='java'>Java</option>" +
                "   <option value='javascript'>Javascript</option>" +
                "   <option value='python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="user", method={RequestMethod.GET, RequestMethod.POST})
    public String getUser(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "   <li>" + first + "</li>" +
                "   <li>" + second + "</li>" +
                "   <li>" + third + "</li>";
    }

}
