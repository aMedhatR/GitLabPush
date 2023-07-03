package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "gitlab", url = "https://gitlab.com")
public interface GitLabClient {

    @PostMapping(value = "/api/v4/projects/46180345/repository/files/app%2F{file_path}", headers = "PRIVATE-TOKEN=glpat-dvDyZsuzKR2jz19iy383")
    String createFile(@RequestParam("file_path") String filePath,
                      @RequestParam("content") String content,
                      @RequestParam("branch") String branch,
                      @RequestParam("commit_message") String commitMessage);

    @PutMapping(value = "/api/v4/projects/46180345/repository/files/app%2F{file_path}", headers = "PRIVATE-TOKEN=glpat-dvDyZsuzKR2jz19iy383")
    String updateFile(@RequestParam("id") String id,
                      @RequestParam("file_path") String filePath,
                      @RequestParam("content") String content,
                      @RequestParam("branch") String branch,
                      @RequestParam("commit_message") String commitMessage);

}
