param([string]$Name); $p = Join-Path $PSScriptRoot $Name; if (Test-Path $p) { throw "Folder already exists" }; $d = Join-Path $p "src\main\java\com\example\demo"; New-Item -ItemType Directory -Path $d -Force | Out-Null; @"
package com.example.demo;
public class Main {
    public static void main(String[] args) {
        System.out.println("Project ready!");
    }
}
"@ | Set-Content (Join-Path $d "Main.java"); Write-Host "Project created: $p"
