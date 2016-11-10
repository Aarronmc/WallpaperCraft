@echo off
set "$ext=.png"

for /f "delims=" %%b in ('dir /b/a-d *%$ext%') do for /f "tokens=1 delims=()" %%c in ('echo %%b') do ren "%%~nb%$ext%" "%%~nc%$ext%"