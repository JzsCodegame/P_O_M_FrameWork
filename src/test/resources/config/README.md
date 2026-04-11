# Framework data configuration

This folder stores externalized test data for framework-driven execution.

## Config files
- Default file (text/diff-friendly): `framework-data.csv`
- Optional file (Excel): `framework-data.xlsx` using sheet `signup_data`
- Format: two columns (`key`, `value`)

### Current keys
- `base.url`
- `signup.email`
- `signup.firstName`
- `signup.lastName`
- `signup.password`

## How framework reads it
- Reader: `framework.config.ExcelKeyValueConfigReader`
- Accessor: `framework.config.SignupDataConfig`

To use another file path at runtime:

```bash
mvn test -Dframework.config.path=/absolute/path/to/framework-data.csv
```
