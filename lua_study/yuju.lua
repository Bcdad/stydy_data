do
    local a = 5;
    local b = 5;
    if a > b then
        print("a>b")
    elseif a == b then
        print("a=b")
    else
        print("a<b")
    end
end
do
    local a = 0
    while a < 3 do
        print(a)
        a = a + 1
    end
end
do
    local a = 0
    repeat
        print(a)
        a = a + 1
    until a == 3
end
do
    local function hello(a, b, c)
        print(a .. (b or '') .. (c or ''))
    end
    hello("hello ", 'world')
end
-- do
--     local a = { ["one"] = 1 }
--     local c = { ["one"] = 1 }
--     local b = { one = 1 }
--     print(a == c)
--     print(a.one)
--     print(b["one"])
-- end
do
    local a={}
    a.one=1
    -- a[1]=10
    print(a.one,#a) --#计算数组元素数量
end
do
    local a={1,2,3,4,"hello"}
    for i,f in pairs(a) do
        print(i,'=>',f)
    end
end

