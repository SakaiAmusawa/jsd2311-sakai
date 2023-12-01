# 目录

1. [包名（Package Names）](#包名package-names)
2. [类名（Class Names）](#类名class-names)
3. [接口名（Interface Names）](#接口名interface-names)
4. [方法名（Method Names）](#方法名method-names)
5. [变量名（Variable Names）](#变量名variable-names)
6. [常量名（Constants）](#常量名constants)
7. [包含多个单词的缩写（Abbreviations in Names）](#包含多个单词的缩写abbreviations-in-names)
8. [避免单个字符作为变量名（Single-letter Names）](#避免单个字符作为变量名single-letter-names)
9. [命名应具有描述性（Descriptive Names）](#命名应具有描述性descriptive-names)
10. [遵循约定（Consistency）](#遵循约定consistency)

# Java命名规范

## 包名（Package Names）
- 使用小写字母，多个单词用`.`分隔。例如：`com.example.myapp`

## 类名（Class Names）
- 驼峰命名法（CamelCase），首字母大写，每个单词的首字母也大写。例如：`MyClass`

## 接口名（Interface Names）
- 驼峰命名法，通常使用形容词或描述性词语。例如：`Runnable`

## 方法名（Method Names）
- 驼峰命名法，首字母小写。例如：`calculateTotal()`

## 变量名（Variable Names）
- 驼峰命名法，首字母小写。例如：`myVariable`

## 常量名（Constants）
- 全大写，单词间用下划线 `_` 分隔。例如：`MAX_VALUE`

## 包含多个单词的缩写（Abbreviations in Names）
- 尽量避免缩写，若使用，保持一致性。例如：`XMLHttpRequest`

## 避免单个字符作为变量名（Single-letter Names）
- 除了循环中的索引或特殊情况外，尽量使用有意义的变量名。

## 命名应具有描述性（Descriptive Names）
- 变量、方法和类的命名应具有描述性，能清晰表达其用途和含义。

## 遵循约定（Consistency）
- 在项目中保持一致地命名风格是非常重要的。

以上是Java命名规范的基本指南，遵循这些规范有助于提高代码的可读性和可维护性。