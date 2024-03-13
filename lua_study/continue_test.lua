do
    for a = 1, 10 do
        if a % 2 ~= 1 then
            goto continue
        end
        print(a)
        ::continue:: --名字可以任意设置
        a = a + 1
    end
end
print(a) --nil for语句自带local
local a = print
a("hello")
