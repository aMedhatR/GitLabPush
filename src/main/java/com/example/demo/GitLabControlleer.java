package com.example.demo;

import org.springframework.web.bind.annotation.*;


@RestController("/")
public class GitLabControlleer {

    private final GitLabClient gitLabClient;

    public GitLabControlleer(GitLabClient gitLabClient) {
        this.gitLabClient = gitLabClient;
    }

    String fileName = "project123.json";
    String content = "{\"name\":\"John\", \"age\":30, \"car\":null}";
    String commitMessage = "commit";


    @PostMapping("createFile")
    public String createFile( @RequestParam("file_path") String filePath,
                              @RequestParam String branch,
                              @RequestParam("commit_message") String commitMessage) {
        return gitLabClient.createFile(filePath, content, branch, commitMessage);
    }

    @PutMapping("updateFile")
    public String updateFile(@RequestParam String id,
                             @RequestParam("file_path") String filePath,
                             @RequestParam String content,
                             @RequestParam String branch,
                             @RequestParam("commit_message") String commitMessage) {
        return gitLabClient.updateFile(id, filePath, content, branch, commitMessage);
    }

}
